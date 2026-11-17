package ch.noveit.ai.charly.factory.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller für Health-Endpunkt.
 */
@RestController
public class HealthController {

    /**
     * Gibt den Health-Status des Services zurück.
     *
     * @return ein Objekt mit dem Status
     */
    @GetMapping("/health")
    public HealthStatus health() {
        return new HealthStatus("UP");
    }

    /**
     * DTO für Health-Status.
     */
    public static class HealthStatus {
        private final String status;

        public HealthStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }
}
