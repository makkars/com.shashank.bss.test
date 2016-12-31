package com.shashank.bss.test.entity.converters;

import org.springframework.stereotype.Service;

@Service ("entityConveters")
public class EntityConverter
{
    @Override public String toString()
    {
        final StringBuilder sb = new StringBuilder("Hello EntityConverter{");
        sb.append('}');
        return sb.toString();
    }
}
