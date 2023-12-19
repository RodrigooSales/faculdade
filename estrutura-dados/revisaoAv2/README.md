Implementação HeapMin e HeapMax

MaxHeap maxHeap = new MaxHeap();
  maxHeap.insert(99);
  maxHeap.insert(57);
  maxHeap.insert(60);
  maxHeap.insert(32);
  maxHeap.insert(15);
  maxHeap.insert(53);
  System.out.println(maxHeap.getHeap());
  maxHeap.insert(95);
  System.out.println(maxHeap.getHeap());
  maxHeap.delete();
  System.out.println(maxHeap.getHeap());

MinHeap minHeap = new MinHeap();
  minHeap.insert(99);
  minHeap.insert(57);
  minHeap.insert(60);
  minHeap.insert(32);
  minHeap.insert(15);
  minHeap.insert(53);
  System.out.println(minHeap.getHeap());
  minHeap.insert(95);
  System.out.println(minHeap.getHeap());

Implementação HashTable