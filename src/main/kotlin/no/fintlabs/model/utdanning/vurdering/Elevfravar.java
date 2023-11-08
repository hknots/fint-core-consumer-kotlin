package no.fintlabs.model.utdanning.vurdering;

import lombok.Data;
import no.fintlabs.model.Identifikator;

import java.util.HashMap;
import java.util.Map;

@Data
public class Elevfravar implements FintMainObject {

    private Identifikator superSystemId;

    @Override
    public Map<String, Identifikator> getIdentifikators() {
        HashMap<String, Identifikator> identifikatorHashMap = new HashMap<>();
        identifikatorHashMap.put("superSystemId", superSystemId);
        return identifikatorHashMap;
    }

}
