package org.processmining.models.graphbased.directed;

import java.util.Collection;

public interface DirectedGraphEdge<S extends DirectedGraphNode, T extends DirectedGraphNode> extends
		DirectedGraphElement {

	/**
	 * Implementations of this class should also implement DirectedGraphEdge<N, ?>
	 * @author bfvdonge
	 *
	 * @param <N>
	 */
	public static interface MultipleSources<N extends DirectedGraphNode> {
		Collection<N> getSources();
	}

	/**
	 * Implementations of this class should also implement DirectedGraphEdge<?, N>
	 * @author bfvdonge
	 *
	 * @param <N>
	 */
	public static interface MultipleTargets<N extends DirectedGraphNode> {
		Collection<N> getTargets();
	}

	S getSource();

	T getTarget();

}
