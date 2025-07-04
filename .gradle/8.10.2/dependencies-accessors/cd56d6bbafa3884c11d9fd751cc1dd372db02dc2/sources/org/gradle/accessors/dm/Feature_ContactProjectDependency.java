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
public class Feature_ContactProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_ContactProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:contact:data"
     */
    public Feature_Contact_DataProjectDependency getData() { return new Feature_Contact_DataProjectDependency(getFactory(), create(":feature:contact:data")); }

    /**
     * Creates a project dependency on the project at path ":feature:contact:domain"
     */
    public Feature_Contact_DomainProjectDependency getDomain() { return new Feature_Contact_DomainProjectDependency(getFactory(), create(":feature:contact:domain")); }

    /**
     * Creates a project dependency on the project at path ":feature:contact:ui"
     */
    public Feature_Contact_UiProjectDependency getUi() { return new Feature_Contact_UiProjectDependency(getFactory(), create(":feature:contact:ui")); }

}
