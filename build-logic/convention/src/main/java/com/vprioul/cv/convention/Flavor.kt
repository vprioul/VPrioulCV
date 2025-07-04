package com.vprioul.cv.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.ApplicationProductFlavor
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.build.api.dsl.LibraryProductFlavor
import com.android.build.api.dsl.ProductFlavor

enum class FlavorDimension {
    CONTENTTYPE
}

@Suppress("naming:EnumNaming", "EnumEntryName")
enum class Flavor(val dimension: FlavorDimension, val applicationIdSuffix: String? = null) {
    demo(FlavorDimension.CONTENTTYPE, applicationIdSuffix = ".demo"),
    prod(FlavorDimension.CONTENTTYPE)
}

fun configureFlavors(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    flavorConfigurationBlock: ProductFlavor.(flavor: Flavor) -> Unit = {}
) {
    commonExtension.apply {
        flavorDimensions += FlavorDimension.CONTENTTYPE.name
        productFlavors {
            Flavor.values().forEach {
                create(it.name) {

                    dimension = it.dimension.name
                    flavorConfigurationBlock(this, it)
                    if (this@apply is ApplicationExtension && this is ApplicationProductFlavor) {
                        if (it.applicationIdSuffix != null) {
                            applicationIdSuffix = it.applicationIdSuffix
                            isDefault = it.name == Flavor.demo.name
                        }
                    }
                    if (this@apply is LibraryExtension && this is LibraryProductFlavor) {
                        isDefault = it.name == Flavor.demo.name
                    }

                }
            }
        }
    }
}
