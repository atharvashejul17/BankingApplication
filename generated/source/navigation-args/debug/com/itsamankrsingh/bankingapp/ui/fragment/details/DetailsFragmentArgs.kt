package com.itsamankrsingh.bankingapp.ui.fragment.details

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.itsamankrsingh.bankingapp.database.Customer
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val customer: Customer
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Customer::class.java)) {
      result.putParcelable("customer", this.customer as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Customer::class.java)) {
      result.putSerializable("customer", this.customer as Serializable)
    } else {
      throw UnsupportedOperationException(Customer::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __customer : Customer?
      if (bundle.containsKey("customer")) {
        if (Parcelable::class.java.isAssignableFrom(Customer::class.java) ||
            Serializable::class.java.isAssignableFrom(Customer::class.java)) {
          __customer = bundle.get("customer") as Customer?
        } else {
          throw UnsupportedOperationException(Customer::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__customer == null) {
          throw IllegalArgumentException("Argument \"customer\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"customer\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__customer)
    }
  }
}
