SUMMARY = "X.Org X server -- ATI integrated graphics chipsets driver"

DESCRIPTION = "xf86-video-ati is an Xorg driver for Intel integrated	\
graphics chipsets. The driver supports depths 8, 15, 16 and 24. On	\
some chipsets, the driver supports hardware accelerated 3D via the	\
Direct Rendering Infrastructure (DRI)."

require recipes-graphics/xorg-driver/xorg-driver-video.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=aabff1606551f9461ccf567739af63dc"

DEPENDS += "virtual/libx11 drm dri2proto glproto \
	    virtual/libgl xineramaproto libpciaccess \
	    udev glamor-egl \
"

EXTRA_OECONF += "--enable-udev --enable-glamor"

SRC_URI = " \
	   git://anongit.freedesktop.org/git/xorg/driver/xf86-video-ati \
"

SRCREV = "906a0ec9224146098bb4581486129d2934d36495"
PV = "7.4.0+git${SRCPV}"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "glamor-egl \
		   mesa-driver-radeon \
		   mesa-driver-radeonsi \
		   mesa-driver-swrast \
"

COMPATIBLE_HOST = '(i.86|x86_64).*-linux'

PACKAGES += "${PN}-conf"
FILES_${PN}-conf = "${datadir}/X11"
