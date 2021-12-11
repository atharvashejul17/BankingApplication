package com.itsamankrsingh.bankingapp.ui.fragment.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.itsamankrsingh.bankingapp.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragmentToCustomerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_customerFragment)

    public fun actionHomeFragmentToTransactionRecordFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_transactionRecordFragment)
  }
}
