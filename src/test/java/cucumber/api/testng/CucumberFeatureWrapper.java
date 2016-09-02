package cucumber.api.testng;

import cucumber.runtime.model.CucumberFeature;

/**
 * The only purpose of this interface is to be able to provide a custom
 * {@linkplain #toString()}, making TestNG reports look more descriptive.
 *
 * @see CucumberFeatureWrapperImpl
 */
public interface CucumberFeatureWrapper {
    public CucumberFeature getCucumberFeature();
}
