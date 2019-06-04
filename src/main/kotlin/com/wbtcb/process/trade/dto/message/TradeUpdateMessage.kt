package com.wbtcb.process.trade.message

import java.io.Serializable
import java.math.BigDecimal
import java.util.UUID

data class TradeUpdateMessage(
    val orderRef: UUID,
    val channelCode: String,
    val stockCode: String,
    val amount: BigDecimal
    // TODO
) : Serializable
