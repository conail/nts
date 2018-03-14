// Copyright 2001 by
// DANTE e.V. and any individual authors listed elsewhere in this file. 
// 
// This file is part of the NTS system.
// ------------------------------------
// 
// It may be distributed and/or modified under the
// conditions of the NTS Public License (NTSPL), either version 1.0
// of this license or (at your option) any later version.
// The latest version of this license is in
//    http://www.dante.de/projects/nts/ntspl.txt
// and version 1.0 or later is part of all distributions of NTS 
// version 1.0-beta or later.
// 
// The list of all files belonging to the NTS distribution is given in
// the file `manifest.txt'. 
// 
// Filename: nts/node/VoidBoxNode.java
// $Id: VoidBoxNode.java,v 1.1.1.1 2000/06/06 08:31:21 ksk Exp $
package	nts.node;

import	nts.base.Dimen;
import	nts.io.Log;
import	nts.io.CntxLog;

public class	VoidBoxNode	extends BaseNode
				implements Box {
    /* corresponding to NO_node */

    public static final VoidBoxNode		BOX = new VoidBoxNode();

    protected VoidBoxNode() { }

    public final boolean	isVoid() { return true; }
    public final boolean	isHBox() { return false; }
    public final boolean	isVBox() { return false; }

    public BoxSizes	getSizes() { return BoxSizes.NULL; }
    public Box		pretendSizesCopy(BoxSizes sizes) { return this; }
    public Box		pretendingWidth(Dimen width) { return this; }
    public void		typeSet(TypeSetter setter) { }

    public final NodeEnum	getHorizList() { return NodeEnum.NULL; }
    public final NodeEnum	getVertList() { return NodeEnum.NULL; }

    public void		addOn(Log log, int maxDepth, int maxCount)
	{ log.add("void"); }

    public void		addOn(Log log, CntxLog cntx)
	{ log.add("void"); }

    public FontMetric	addShortlyOn(Log log, FontMetric metric)
	{ return metric; }

    public String	toString() { return "VoidBox"; }

}
