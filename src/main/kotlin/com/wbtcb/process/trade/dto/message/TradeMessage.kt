package com.wbtcb.process.trade.dto.message

import java.io.Serializable
import java.math.BigDecimal
import java.util.UUID

data class TradeMessage(
    val id: Int,
    val orderRef: UUID,
    val channelCode: String,
    val amount: BigDecimal
) : Serializable
