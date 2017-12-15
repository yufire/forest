package org.forest.filter;

import org.forest.config.ForestConfiguration;

/**
 * @author gongjun[dt_flys@hotmail.com]
 * @since 2016-05-24
 */
public interface Filter {

    Object doFilter(ForestConfiguration configuration, Object data);
}
