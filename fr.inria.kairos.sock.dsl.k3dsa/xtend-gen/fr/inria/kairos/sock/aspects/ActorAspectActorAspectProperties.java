package fr.inria.kairos.sock.aspects;

import java.util.Random;

@SuppressWarnings("all")
public class ActorAspectActorAspectProperties {
  public Integer timeIndex = Integer.valueOf(0);
  
  public String secret = Integer.valueOf(new Random().nextInt()).toString();
  
  public Integer currentProcessTime = Integer.valueOf(0);
  
  public Integer isPriority = Integer.valueOf(0);
  
  public Integer processTime = Integer.valueOf(3);
  
  public Integer periodTime = Integer.valueOf(10);
}
