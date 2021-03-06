// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.codeHighlighting;

import com.intellij.util.DeprecatedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface BackgroundEditorHighlighter {
  HighlightingPass @NotNull [] createPassesForEditor();

  /**
   * @deprecated use {@link #createPassesForEditor()} instead
   */
  @Deprecated
  @Contract("->fail")
  default HighlightingPass @NotNull [] createPassesForVisibleArea() {
    DeprecatedMethodException.report("Use createPassesForEditor() instead");
    throw new UnsupportedOperationException();
  }
}
