package pub.guoxin.protocol.analysis;

import pub.guoxin.protocol.model.entity.DataProtocol;
import pub.guoxin.protocol.model.entity.ProtocolEntity;

public interface DataProtocolAnalysis {
    DataProtocol analysisProtocolData2ProtocolEntity(String dataProtocol);

    String analysisProtocolEntity2ProtocolData(ProtocolEntity protocolEntity);

}
