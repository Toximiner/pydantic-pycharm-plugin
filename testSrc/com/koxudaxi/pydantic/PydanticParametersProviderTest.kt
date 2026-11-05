package com.koxudaxi.pydantic

import junit.framework.TestCase

class PydanticParametersProviderTest : TestCase() {
    fun testProviderInitializesWithCurrentDataclassApi() {
        // Constructing the provider initializes its BaseModel bypass parameters.
        // An outdated PyDataclassParameters constructor fails here with NoSuchMethodError.
        val provider = PydanticParametersProvider()
        assertEquals("pydantic", provider.getType().name)
    }
}
