package ecommerce.algorithm1.processor;

import java.util.List;

public interface ICycle {
	
	void execute(boolean[] source, int offset, int length);
	List<Integer> getProcess();
	int getSum();
}
