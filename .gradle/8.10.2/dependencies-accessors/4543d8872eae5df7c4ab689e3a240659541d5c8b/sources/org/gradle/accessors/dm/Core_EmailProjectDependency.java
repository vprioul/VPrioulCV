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
public class Core_EmailProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Core_EmailProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":core:email:data"
     */
    public Core_Email_DataProjectDependency getData() { return new Core_Email_DataProjectDependency(getFactory(), create(":core:email:data")); }

    /**
     * Creates a project dependency on the project at path ":core:email:domain"
     */
    public Core_Email_DomainProjectDependency getDomain() { return new Core_Email_DomainProjectDependency(getFactory(), create(":core:email:domain")); }

}
