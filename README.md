DESCRIPTION

This software can be used for the simulation of the data transmission process in a wireless automated system served for the control and monitoring of energy consumption. It consists of two main modules: core and GUI. The core is realized as a jar-file in AnyLogic using the discrete event approach for simulation models development. Typical system configuration for simulation consists of a polling server, N GSM CSD channels, and K GRPS channels. Each communication channel may have an arbitrary number of energy counters of two models: MIR-C01 and SET-4TM. The user can specify a certain number of counters of each type in the channels. In addition, some parameters of the channels and counters can be set, for example, quality of service, coding schemes, settings of cells of the network, maximal answer timeout of the counter, etc. 
The core receives the data inputted by the user using GUI for generating system configuration and simulation settings adjustment. The simulation process is performed inside the core, after reaching a stopping time of the simulation, all calculated statistical data can be displayed in GUI.  
The functionality of the software is: 
1) Setting a structure of the analyzed system, specifying the number of communication channels, data transmission technology, and the number of electricity counters. 
2) Setting of channels and devices parameters;
3) Getting the following results:

    a. The total size of transmitted data, the number of repeated transmissions for each channel, the average quantity of failed data requests for two types of energy counters (for GPRS channels);
    
    b. The average number of connection interruptions, the average number of unsuccessful requests for connection, the average quantity of failed data requests for two types of energy counters (for CSD channels).
Short user instructions on how to start using AGGA you can find in the document Getting started with AGGA. Doc.

LICENSE

The developed simulation model and the source code of the GUI have open access and can freely be used according to CC-BY-SA 4.0 license. However, for the proper functioning of the software as an independent application, it is necessary to use the following libraries in jar-format: beandt, dx, jbcl, jcommon-1.0.12, jfreechart-1.0.9 and xjanylogic5engine. These libraries are uploaded here only for demonstration purposes of the correct functioning of the model and GUI and can be used by stakeholders according to the conditions of licenses for the mentioned libraries. 

CITATION

If this simulation model seems to be useful for your research and you use it, please, make a reference in your publications as Alexander Lyubchenko. (2020, January 17). AGGA: an instrument for data transmission process simulation in a wireless automated system for energy consumption monitoring (Version v1.1). Zenodo. http://doi.org/10.5281/zenodo.3611233
