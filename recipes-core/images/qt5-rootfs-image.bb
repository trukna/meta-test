DESCRIPTION = "Minimal embedded Qt5 image based upon Arago distribution"
LICENSE = "MIT"
PR = "r1"

require ../../../meta-arago/meta-arago-distro/recipes-core/images/arago-image.inc

IMAGE_FEATURES += "\
    splash \
    ssh-server-dropbear \
    tools-debug \
    debug-tweaks \
    hwcodecs \
"

IMAGE_INSTALL += "\
    packagegroup-arago-tisdk-graphics \
    ${@bb.utils.contains('MACHINE_FEATURES','dsp','packagegroup-arago-tisdk-opencl','',d)} \
    ${@bb.utils.contains('MACHINE_FEATURES','dsp','packagegroup-arago-tisdk-opencl-extra','',d)} \
    packagegroup-image \
    packagegroup-core-tools-debug \
"

export IMAGE_BASENAME = "qt5-rootfs-image"
