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
public class Core_ShareProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Core_ShareProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":core:share:data"
     */
    public Core_Share_DataProjectDependency getData() { return new Core_Share_DataProjectDependency(getFactory(), create(":core:share:data")); }

    /**
     * Creates a project dependency on the project at path ":core:share:domain"
     */
    public Core_Share_DomainProjectDependency getDomain() { return new Core_Share_DomainProjectDependency(getFactory(), create(":core:share:domain")); }

}
