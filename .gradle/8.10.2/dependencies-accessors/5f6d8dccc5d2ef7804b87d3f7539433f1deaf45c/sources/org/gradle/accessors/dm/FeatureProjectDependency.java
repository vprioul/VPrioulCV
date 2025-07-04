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
public class FeatureProjectDependency extends DelegatingProjectDependency {

    @Inject
    public FeatureProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:contact"
     */
    public Feature_ContactProjectDependency getContact() { return new Feature_ContactProjectDependency(getFactory(), create(":feature:contact")); }

    /**
     * Creates a project dependency on the project at path ":feature:education"
     */
    public Feature_EducationProjectDependency getEducation() { return new Feature_EducationProjectDependency(getFactory(), create(":feature:education")); }

    /**
     * Creates a project dependency on the project at path ":feature:experience"
     */
    public Feature_ExperienceProjectDependency getExperience() { return new Feature_ExperienceProjectDependency(getFactory(), create(":feature:experience")); }

    /**
     * Creates a project dependency on the project at path ":feature:home"
     */
    public Feature_HomeProjectDependency getHome() { return new Feature_HomeProjectDependency(getFactory(), create(":feature:home")); }

    /**
     * Creates a project dependency on the project at path ":feature:skills"
     */
    public Feature_SkillsProjectDependency getSkills() { return new Feature_SkillsProjectDependency(getFactory(), create(":feature:skills")); }

    /**
     * Creates a project dependency on the project at path ":feature:splash"
     */
    public Feature_SplashProjectDependency getSplash() { return new Feature_SplashProjectDependency(getFactory(), create(":feature:splash")); }

}
