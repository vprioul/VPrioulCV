package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class Feature_SplashProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_SplashProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:splash:data"
     */
    public Feature_Splash_DataProjectDependency getData() { return new Feature_Splash_DataProjectDependency(getFactory(), create(":feature:splash:data")); }

    /**
     * Creates a project dependency on the project at path ":feature:splash:domain"
     */
    public Feature_Splash_DomainProjectDependency getDomain() { return new Feature_Splash_DomainProjectDependency(getFactory(), create(":feature:splash:domain")); }

    /**
     * Creates a project dependency on the project at path ":feature:splash:ui"
     */
    public Feature_Splash_UiProjectDependency getUi() { return new Feature_Splash_UiProjectDependency(getFactory(), create(":feature:splash:ui")); }

}
