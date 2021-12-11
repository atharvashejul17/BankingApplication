package com.itsamankrsingh.bankingapp.ui.fragment.customer

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.itsamankrsingh.bankingapp.R
import com.itsamankrsingh.bankingapp.database.Customer
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CustomerFragmentDirections private constructor() {
  private data class ActionCustomerFragmentToDetailsFragment(
    public val customer: Customer
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_customerFragment_to_detailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionCustomerFragmentToDetailsFragment(customer: Customer): NavDirections =
        ActionCustomerFragmentToDetailsFragment(customer)
  }
}
