package be.kunlabora.urls;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VerifierTest {

    @Test
    public void verifyUrl_WithHTTP_ShouldSucceed() {
        assertThat(Verifier.verifyUrl("http://www.thundercats.com")).isTrue();
    }

    @Test
    public void verifyUrl_URLEndingInDot_ShouldFail() {
        assertThat(Verifier.verifyUrl("http://.")).isFalse();
    }

    @Test
    public void verifyUrl_URLWithoutHttpOrHttps_ShouldFail() {
        assertThat(Verifier.verifyUrl("google.com")).isFalse();
    }

    @Test
    public void verifyUrl_WithAnIPAddress_ShouldFail() {
        assertThat(Verifier.verifyUrl("127.0.0.1")).isFalse();
    }

    @Test
    public void verifyUrl_URLWithoutDomain_ShouldFail() {
        assertThat(Verifier.verifyUrl("http://")).isFalse();
    }
}