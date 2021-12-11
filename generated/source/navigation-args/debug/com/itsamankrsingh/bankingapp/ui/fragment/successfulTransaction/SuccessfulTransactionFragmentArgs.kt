package com.itsamankrsingh.bankingapp.ui.fragment.successfulTransaction

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.itsamankrsingh.bankingapp.database.Customer
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class SuccessfulTransactionFragmentArgs(
  public val senderCustomer: Customer,
  public val receiverCustomer: Customer,
  public val transferAmount: Int
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Customer::class.java)) {
      result.putParcelable("senderCustomer", this.senderCustomer as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Customer::class.java)) {
      result.putSerializable("senderCustomer", this.senderCustomer as Serializable)
    } else {
      throw UnsupportedOperationException(Customer::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(Customer::class.java)) {
      result.putParcelable("receiverCustomer", this.receiverCustomer as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Customer::class.java)) {
      result.putSerializable("receiverCustomer", this.receiverCustomer as Serializable)
    } else {
      throw UnsupportedOperationException(Customer::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putInt("transferAmount", this.transferAmount)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SuccessfulTransactionFragmentArgs {
      bundle.setClassLoader(SuccessfulTransactionFragmentArgs::class.java.classLoader)
      val __senderCustomer : Customer?
      if (bundle.containsKey("senderCustomer")) {
        if (Parcelable::class.java.isAssignableFrom(Customer::class.java) ||
            Serializable::class.java.isAssignableFrom(Customer::class.java)) {
          __senderCustomer = bundle.get("senderCustomer") as Customer?
        } else {
          throw UnsupportedOperationException(Customer::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__senderCustomer == null) {
          throw IllegalArgumentException("Argument \"senderCustomer\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"senderCustomer\" is missing and does not have an android:defaultValue")
      }
      val __receiverCustomer : Customer?
      if (bundle.containsKey("receiverCustomer")) {
        if (Parcelable::class.java.isAssignableFrom(Customer::class.java) ||
            Serializable::class.java.isAssignableFrom(Customer::class.java)) {
          __receiverCustomer = bundle.get("receiverCustomer") as Customer?
        } else {
          throw UnsupportedOperationException(Customer::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__receiverCustomer == null) {
          throw IllegalArgumentException("Argument \"receiverCustomer\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"receiverCustomer\" is missing and does not have an android:defaultValue")
      }
      val __transferAmount : Int
      if (bundle.containsKey("transferAmount")) {
        __transferAmount = bundle.getInt("transferAmount")
      } else {
        throw IllegalArgumentException("Required argument \"transferAmount\" is missing and does not have an android:defaultValue")
      }
      return SuccessfulTransactionFragmentArgs(__senderCustomer, __receiverCustomer,
          __transferAmount)
    }
  }
}
