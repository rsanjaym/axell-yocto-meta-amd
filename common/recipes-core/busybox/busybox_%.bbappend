FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += " \
	    file://switch_root.cfg \
	    file://losetup.cfg \
           "
