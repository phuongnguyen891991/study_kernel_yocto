obj-m := mmap_test.o

#KDIR := /lib/modules/$(shell uname -r)/build
SRC := $(shell pwd)

all:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules

modules_install:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules_install

clean:
	rm -f *.o *~ core .depend .*.cmd *.ko *.mod.c
	rm -f Module.markers Module.symvers modules.order 
	rm -rf .tmp_versions Modules.symvers
#%.ko: %.o
#(KDIR) SUBDIRS=$(PWD) $@
#
#kernel_modules:
#(KDIR) SUBDIRS=$(PWD) modules
#gcc test.c -o test
#
#clean:
#(KDIR) SUBDIRS=$(PWD) clean
#rm -f test


