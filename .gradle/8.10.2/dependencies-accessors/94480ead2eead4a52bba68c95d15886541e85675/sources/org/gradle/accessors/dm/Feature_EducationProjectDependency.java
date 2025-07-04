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
public class Feature_EducationProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_EducationProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:education:data"
     */
    public Feature_Education_DataProjectDependency getData() { return new Feature_Education_DataProjectDependency(getFactory(), create(":feature:education:data")); }

    /**
     * Creates a project dependency on the project at path ":feature:education:domain"
     */
    public Feature_Education_DomainProjectDependency getDomain() { return new Feature_Education_DomainProjectDependency(getFactory(), create(":feature:education:domain")); }

    /**
     * Creates a project dependency on the project at path ":feature:education:ui"
     */
    public Feature_Education_UiProjectDependency getUi() { return new Feature_Education_UiProjectDependency(getFactory(), create(":feature:education:ui")); }

}
