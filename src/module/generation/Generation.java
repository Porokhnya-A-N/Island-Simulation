package module.generation;

public interface Generation {
     default int toGenerate(int maxCount){
          return (int) (Math.random() * maxCount);
     }

}
