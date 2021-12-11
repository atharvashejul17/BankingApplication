package com.itsamankrsingh.bankingapp.ui.fragment.successfulTransaction

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.itsamankrsingh.bankingapp.R

public class SuccessfulTransactionFragmentDirections private constructor() {
  public companion object {
    public fun actionSuccessfulTransactionFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_successfulTransactionFragment_to_homeFragment)
  }
}
