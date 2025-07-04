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
public class Feature_LoginProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_LoginProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:login:data"
     */
    public Feature_Login_DataProjectDependency getData() { return new Feature_Login_DataProjectDependency(getFactory(), create(":feature:login:data")); }

    /**
     * Creates a project dependency on the project at path ":feature:login:domain"
     */
    public Feature_Login_DomainProjectDependency getDomain() { return new Feature_Login_DomainProjectDependency(getFactory(), create(":feature:login:domain")); }

    /**
     * Creates a project dependency on the project at path ":feature:login:ui"
     */
    public Feature_Login_UiProjectDependency getUi() { return new Feature_Login_UiProjectDependency(getFactory(), create(":feature:login:ui")); }

}
