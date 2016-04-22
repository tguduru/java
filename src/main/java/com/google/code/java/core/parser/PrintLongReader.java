/*
 * Copyright (c) 2011.  Peter Lawrey
 *
 * "THE BEER-WARE LICENSE" (Revision 128)
 * As long as you retain this notice you can do whatever you want with this stuff.
 * If we meet some day, and you think this stuff is worth it, you can buy me a beer in return
 * There is no warranty.
 */

package com.google.code.java.core.parser;

import java.io.BufferedReader;
import java.io.IOException;

public class PrintLongReader implements LongReader {
  private final BufferedReader br;

  public PrintLongReader(BufferedReader br) {
    this.br = br;
  }

  @Override
  public long read() throws IOException, NumberFormatException {
    return Long.parseLong(br.readLine());
  }

  @Override
  public void close() {
    ParserUtils.close(br);
  }
}
