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
public class Feature_HobbiesProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_HobbiesProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:hobbies:data"
     */
    public Feature_Hobbies_DataProjectDependency getData() { return new Feature_Hobbies_DataProjectDependency(getFactory(), create(":feature:hobbies:data")); }

    /**
     * Creates a project dependency on the project at path ":feature:hobbies:domain"
     */
    public Feature_Hobbies_DomainProjectDependency getDomain() { return new Feature_Hobbies_DomainProjectDependency(getFactory(), create(":feature:hobbies:domain")); }

    /**
     * Creates a project dependency on the project at path ":feature:hobbies:ui"
     */
    public Feature_Hobbies_UiProjectDependency getUi() { return new Feature_Hobbies_UiProjectDependency(getFactory(), create(":feature:hobbies:ui")); }

}
