package com.facebook.presto.github;

import com.facebook.presto.spi.ConnectorTableLayoutHandle;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubTableLayoutHandle
    implements ConnectorTableLayoutHandle
{
    public GithubTableLayoutHandle(@JsonProperty("table") GithubTableHandle table)
    {
    }
}
