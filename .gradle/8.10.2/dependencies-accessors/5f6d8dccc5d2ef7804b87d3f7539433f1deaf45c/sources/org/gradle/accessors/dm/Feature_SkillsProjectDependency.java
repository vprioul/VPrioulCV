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
public class Feature_SkillsProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_SkillsProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:skills:data"
     */
    public Feature_Skills_DataProjectDependency getData() { return new Feature_Skills_DataProjectDependency(getFactory(), create(":feature:skills:data")); }

    /**
     * Creates a project dependency on the project at path ":feature:skills:domain"
     */
    public Feature_Skills_DomainProjectDependency getDomain() { return new Feature_Skills_DomainProjectDependency(getFactory(), create(":feature:skills:domain")); }

    /**
     * Creates a project dependency on the project at path ":feature:skills:ui"
     */
    public Feature_Skills_UiProjectDependency getUi() { return new Feature_Skills_UiProjectDependency(getFactory(), create(":feature:skills:ui")); }

}
