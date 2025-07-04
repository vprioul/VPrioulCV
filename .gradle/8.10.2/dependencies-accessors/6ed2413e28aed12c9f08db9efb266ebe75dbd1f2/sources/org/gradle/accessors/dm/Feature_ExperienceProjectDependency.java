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
public class Feature_ExperienceProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_ExperienceProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:experience:data"
     */
    public Feature_Experience_DataProjectDependency getData() { return new Feature_Experience_DataProjectDependency(getFactory(), create(":feature:experience:data")); }

    /**
     * Creates a project dependency on the project at path ":feature:experience:domain"
     */
    public Feature_Experience_DomainProjectDependency getDomain() { return new Feature_Experience_DomainProjectDependency(getFactory(), create(":feature:experience:domain")); }

    /**
     * Creates a project dependency on the project at path ":feature:experience:ui"
     */
    public Feature_Experience_UiProjectDependency getUi() { return new Feature_Experience_UiProjectDependency(getFactory(), create(":feature:experience:ui")); }

}
