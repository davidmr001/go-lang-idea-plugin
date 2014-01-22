package com.goide.stubs;

import com.goide.psi.GoAnonymousFieldDefinition;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;

public class GoAnonymousFieldDefinitionStub extends GoNamedStub<GoAnonymousFieldDefinition> {
  public GoAnonymousFieldDefinitionStub(StubElement parent, IStubElementType elementType, StringRef name, boolean isPublic) {
    super(parent, elementType, name, isPublic);
  }

  public GoAnonymousFieldDefinitionStub(StubElement parent, IStubElementType elementType, String name, boolean isPublic) {
    super(parent, elementType, name, isPublic);
  }
}
