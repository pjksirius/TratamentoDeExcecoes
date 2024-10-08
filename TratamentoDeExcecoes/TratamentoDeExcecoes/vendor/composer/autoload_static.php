<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit0308e7a616979634934a6fb9f1dbce74
{
    public static $prefixLengthsPsr4 = array (
        'A' => 
        array (
            'Admin\\TratamentoDeExcecoes\\' => 27,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'Admin\\TratamentoDeExcecoes\\' => 
        array (
            0 => __DIR__ . '/../..' . '/src',
        ),
    );

    public static $classMap = array (
        'Composer\\InstalledVersions' => __DIR__ . '/..' . '/composer/InstalledVersions.php',
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit0308e7a616979634934a6fb9f1dbce74::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit0308e7a616979634934a6fb9f1dbce74::$prefixDirsPsr4;
            $loader->classMap = ComposerStaticInit0308e7a616979634934a6fb9f1dbce74::$classMap;

        }, null, ClassLoader::class);
    }
}
