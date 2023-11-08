package no.fintlabs.model.utdanning.vurdering;

import lombok.Data;
import no.fintlabs.model.Identifikator;

import java.util.HashMap;
import java.util.Map;

@Data
public class Elev implements FintMainObject {

    private Identifikator systemId;

    @Override
    public Map<String, Identifikator> getIdentifikators() {
        HashMap<String, Identifikator> identifikatorHashMap = new HashMap<>();
        identifikatorHashMap.put("systemId", systemId);
        return identifikatorHashMap;
    }

}
