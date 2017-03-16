package org.btlas;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * Created by yanglikun on 2017/3/16.
 */
@HandlesTypes(ITestInitializer.class)
public class WebStart implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("启动...");
    }

}
