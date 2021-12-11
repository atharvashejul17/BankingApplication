package com.itsamankrsingh.bankingapp.ui.fragment.details

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.itsamankrsingh.bankingapp.R
import com.itsamankrsingh.bankingapp.database.Customer
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class DetailsFragmentDirections private constructor() {
  private data class ActionDetailsFragmentToTransactionFragment(
    public val transferAmount: Int,
    public val customer: Customer
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_detailsFragment_to_transactionFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("transferAmount", this.transferAmount)
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
  }

  public companion object {
    public fun actionDetailsFragmentToTransactionFragment(transferAmount: Int, customer: Customer):
        NavDirections = ActionDetailsFragmentToTransactionFragment(transferAmount, customer)
  }
}
