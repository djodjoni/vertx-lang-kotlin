package io.vertx.kotlin.core.dns

import io.vertx.core.dns.DnsClientOptions

/**
 * A function providing a DSL for building [io.vertx.core.dns.DnsClientOptions] objects.
 *
 * Configuration options for Vert.x DNS client.
 *
 * @param host  Set the host name to be used by this client in requests.
 * @param port  Set the port to be used by this client in requests.
 * @param queryTimeout  Set the query timeout in milliseconds, i.e the amount of time after a query is considered to be failed.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClientOptions original] using Vert.x codegen.
 */
fun DnsClientOptions(
  host: String? = null,
  port: Int? = null,
  queryTimeout: Long? = null): DnsClientOptions = io.vertx.core.dns.DnsClientOptions().apply {

  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (queryTimeout != null) {
    this.setQueryTimeout(queryTimeout)
  }
}

