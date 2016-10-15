package org.processmining.models.graphbased.directed;

import java.util.Collection;

public interface DirectedGraphEdge<S extends DirectedGraphNode, T extends DirectedGraphNode> extends
		DirectedGraphElement {

	public static interface MultipleSources<N extends DirectedGraphNode> {
		Collection<N> getSources();
	}

	public static interface MultipleTargets<N extends DirectedGraphNode> {
		Collection<N> getTargets();
	}

	S getSource();

	T getTarget();

}
