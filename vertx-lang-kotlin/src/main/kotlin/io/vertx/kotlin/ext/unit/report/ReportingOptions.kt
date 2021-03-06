package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.ReportingOptions
import io.vertx.ext.unit.report.ReportOptions

/**
 * A function providing a DSL for building [io.vertx.ext.unit.report.ReportingOptions] objects.
 *
 * Reporting options:
 *
 * <ul>
 *   <li>the <code>reporters</code> is an array of reporter configurations</li>
 * </ul>
 *
 * @param reporters  Replace the current list of reporters with a new one.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.report.ReportingOptions original] using Vert.x codegen.
 */
fun ReportingOptions(
  reporters: Iterable<io.vertx.ext.unit.report.ReportOptions>? = null): ReportingOptions = io.vertx.ext.unit.report.ReportingOptions().apply {

  if (reporters != null) {
    this.setReporters(reporters.toList())
  }
}

