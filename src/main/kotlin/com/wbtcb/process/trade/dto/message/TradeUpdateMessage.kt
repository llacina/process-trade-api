package com.wbtcb.process.trade.message

import com.wbtcb.process.trade.enum.TradeStatus
import java.io.Serializable
import java.math.BigDecimal
import java.util.UUID

data class TradeUpdateMessage(
    val id: Int,
    val orderRef: UUID,
    val channelCode: String,
    val exchangeRequestId: Int,
    val amount: BigDecimal,
    val status: TradeStatus,
    val reasonCode: String? = null,
    val reasonTitle: String? = null,
    val reasonDetail: String? = null
) : Serializable
