See https://ctan.org/tex-archive/systems/nts

See also https://tex.stackexchange.com/questions/385645/is-nts-new-typesetting-system-the-java-implementation-of-tex-usable-today

Got with:

    wget http://mirrors.ctan.org/systems/nts/ntsbase-1.0-beta.README
    wget http://mirrors.ctan.org/systems/nts/ntsbase-1.0-beta.zip

----------

Also, nts-l, from https://ctan.org/pkg/nts-l = https://ctan.org/tex-archive/info/digests/nts-l

Manually generated `files.list`, and did

    for f in $(cat files.list); do echo $f; wget $f; done

----------

And 
