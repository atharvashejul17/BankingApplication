package com.itsamankrsingh.bankingapp.ui.fragment.transaction

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.itsamankrsingh.bankingapp.R
import com.itsamankrsingh.bankingapp.database.Customer
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class TransactionFragmentDirections private constructor() {
  private data class ActionTransactionFragmentToSuccessfulTransactionFragment(
    public val senderCustomer: Customer,
    public val receiverCustomer: Customer,
    public val transferAmount: Int
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_transactionFragment_to_successfulTransactionFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionTransactionFragmentToSuccessfulTransactionFragment(
      senderCustomer: Customer,
      receiverCustomer: Customer,
      transferAmount: Int
    ): NavDirections = ActionTransactionFragmentToSuccessfulTransactionFragment(senderCustomer,
        receiverCustomer, transferAmount)

    public fun actionTransactionFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_transactionFragment_to_homeFragment)
  }
}
