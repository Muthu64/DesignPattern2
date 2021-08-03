package demo.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

import demo.pattern.prototype.remote.AcRemote;
import demo.pattern.prototype.remote.Remote;
import demo.pattern.prototype.remote.RemoteType;
import demo.pattern.prototype.remote.TVRemote;

public class PrototypeFactory
{
    Map<RemoteType, Remote> remoteMap = new HashMap<>();

    //create complex objects at first and put it in a hash map for further use
    public void fillMap()
    {
        remoteMap.put( RemoteType.TV, new TVRemote() );
        remoteMap.put( RemoteType.AC, new AcRemote() );
    }

    public Remote getRemote( RemoteType remoteType )
    {
        return this.remoteMap.get( remoteType ).createClone();
    }
}
