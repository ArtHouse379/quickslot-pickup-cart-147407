package avxuk.vending.quickslotpickupcart.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import avxuk.vending.quickslotpickupcart.data.entity.OrderEntity
import avxuk.vending.quickslotpickupcart.data.repository.OrderRepository
import avxuk.vending.quickslotpickupcart.ui.state.DataUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class OrderViewModel(
    private val orderRepository: OrderRepository,
) : ViewModel() {
    private val _ordersState =
        MutableStateFlow<DataUiState<List<OrderEntity>>>(DataUiState.Initial)
    val ordersState: StateFlow<DataUiState<List<OrderEntity>>>
        get() = _ordersState.asStateFlow()

    init {
        observeOrders()
    }

    private fun observeOrders() {
        viewModelScope.launch {
            orderRepository.observeAll().collect { orders ->
                _ordersState.update { DataUiState.from(orders) }
            }
        }
    }
}
