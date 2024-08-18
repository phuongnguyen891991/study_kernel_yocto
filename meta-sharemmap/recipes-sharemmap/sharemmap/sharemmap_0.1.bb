SUMMARY = "Example of how to build an external bose module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#DEPENDS+=" glibc"
RDEPENDS_${PN}-staticdev = ""
TARGET_CC_ARCH += "${LDFLAGS}"

inherit module

SRC_URI = "file://Makefile \
           file://mmap_test.c \
          "

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-mmap_test"
KERNEL_MODULE_AUTOLOAD += "kernel-module-mmap_test"
