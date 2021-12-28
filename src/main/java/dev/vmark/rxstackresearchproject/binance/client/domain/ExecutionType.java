package dev.vmark.rxstackresearchproject.binance.client.domain;

/**
 * Order execution type.
 */
public enum ExecutionType {
  NEW,
  CANCELED,
  REPLACED,
  REJECTED,
  TRADE,
  EXPIRED
}