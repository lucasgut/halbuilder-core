package com.theoryinpractise.halbuilder;

import java.io.Reader;

public interface HalReader {
    HalResource read(Reader reader);
}